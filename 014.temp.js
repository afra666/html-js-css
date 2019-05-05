// JavaScript Document
"use strict";
var chess=document.getElementById("chess");
//context=画布
var context=chess.getContext("2d");
var me=true;
var bg=new Image();
bg.src="img/bg.png";
//改正
var solid=[];
var layer=0;

var manWin=[];
var pcWin=[];
var gameOver=false;
//创建数组来存储棋盘某处是否有子
var existChess=[];
for(var i=0;i<15;i++){
	existChess[i]=[];
	for(var j=0;j<15;j++){
		existChess[i][j]=0;
	}
}


bg.onload=function(){
	
	context.drawImage(bg,0,0,450,450);
	drawChessBoard();
	ai();
};
var drawChessBoard=function(){
	//起点终点绘制
	for(var i=0;i<15;i++){
	//竖线,x变,y不变
	context.moveTo(15+i*30,15);
	context.lineTo(15+i*30,435);
	context.stroke();
	//横线,x不变 y变
	context.moveTo(15,15+i*30);
	context.lineTo(435,15+i*30);
	context.stroke();
	}

	//画5个圆点
	context.beginPath();
	context.arc(15+7*30,15+7*30,3,0,2*Math.PI);
	context.stroke();
	context.fill();
	context.beginPath();
	context.arc(15+3*30,15+3*30,3,0,2*Math.PI);
//	context.stroke();
	context.fill();
	context.beginPath();
	context.arc(15+11*30,15+3*30,3,0,2*Math.PI);
//	context.stroke();
	context.fill();
	context.beginPath();
	context.arc(15+3*30,15+11*30,3,0,2*Math.PI);
	context.stroke();
	context.fill();
	context.beginPath();
	context.arc(15+11*30,15+11*30,3,0,2*Math.PI);
//	context.stroke();
	context.fill();
};


chess.onclick=function(e){
	var x=e.offsetX;
	var y=e.offsetY;
	
	var col=Math.floor(x/30);
	var line=Math.floor(y/30);
	
	if(existChess[line][col]===0){
	   oneStep(line,col,me);
	   }
	
	//取反
	me=!me;
	
	for (var k = 0; k < layer; k++) {
		if (solid[line][col][k]) {
			manWin[k]++;
			pcWin[k]=6;//异常
			if (manWin[k]==5) {
				window.alert("Yes, You win!");
				gameOver=true;
			}
		}
	}
};


var oneStep=function(line,col,me){
	//me=黑棋=先手
	context.beginPath();
	//arc(x,y,半径12,0,2pi)
	context.arc(15+col*30,15+line*30,12,0,Math.PI*2);
	context.closePath();
	/**
createRadialGradient(xStart, yStart, radiusStart, xEnd, yEnd, radiusEnd)
*/
	var gradient=context.createRadialGradient(15+col*30-2,15+line*30-2,12,15+col*30,15+line*30,0);
	if(me){
	   gradient.addColorStop(0,"#0a0a0a");
		 gradient.addColorStop(1,"#636766");
		existChess[line][col]=1;
	 }else{
		 gradient.addColorStop(0,"#d1d1d1");
		  gradient.addColorStop(1,"#f9f9f9");
		 existChess[line][col]=2;
	}
	//渐变色
	context.fillStyle=gradient;
	context.fill();
};

var ai=function(){
	/**
		AI
*/
	

for (var line = 0; line <15; line++) {
	solid[line]=[];
	for (var col = 0; col < 15; col++) {
		solid[line][col]=[];
	}
}
	
	
	
//是否等价于java中的     bool solid[][][]=new boolean[572][15][15]
/**
赢法数组的索引layer
*/

//横向  从左上至右开始计算 ht t t t t .dlinerectlineon
for(var line=0;line<15;line++){
	for(var col=0;col<=10;col++){
		for(var k=0;k<5;k++){
			//行固定,列变化
			solid[line][col+k][layer]=true;
		}
		layer++;
	}
}
//layer值11*15=165

//竖向,从左上到下
/**
ht
t
t
t
t
*/
for(var line=0;line<15;line++){
	for(var col=0;col<=10;col++){
		for(var k=0;k<5;k++){
			//行变化,列不变
			solid[col+k][line][layer]=true;
		}
		layer++;
}
}
//layer值165*2=330;

//斜线方向,大方向左上到右下,0可以作为起始
/**
ht
	t
		t
			t
				t
*/
for(var line=0;line<=10;line++){
	for(var col=0;col<=10;col++){
		for(var k=0;k<5;k++){
			solid[line+k][col+k][layer]=true;
		}
		layer++;
	}
}

/**
				ht
			t
		t
	t
t
*/
for(var line=0;line<=10;line++){
	for(var col=4;col<15;col++){
		for(var k=0;k<5;k++){
			
			solid[line+k][col-k][layer]=true;
		}
		layer++;
	}
}
	console.log(layer);
	
	//赢法数组置零初始化
	for (var i = 0; i <layer; i++) {
		manWin[i]=0;
		pcWin[i]=0;
	}
};











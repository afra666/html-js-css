// JavaScript Document
"use strict";
var chess=document.getElementById("chess");
//context=画布

var context=chess.getContext("2d");


var me=true;

var bg=new Image();
bg.src="img/bg.png";
bg.onload=function(){
	
	context.drawImage(bg,0,0,450,450);
	drawChessBoard();
};

chess.onclick=function(e){
	var x=e.offsetX;
	var y=e.offsetY;
	
	var col=Math.floor(x/30);
	var line=Math.floor(y/30);
	
	oneStep(line,col,me);
	//取反
	me=!me;
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
	var gradient=context.createRadialGradient(15+col*30,15+line*30,12,15+col*30,15+line*30,0);
	if(me){
	   gradient.addColorStop(0,"#0a0a0a");
		 gradient.addColorStop(1,"#636766");
	 }else{
		 gradient.addColorStop(0,"#d1d1d1");
		  gradient.addColorStop(1,"#f9f9f9");
	}
	//渐变色
	context.fillStyle=gradient;
	context.fill();
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










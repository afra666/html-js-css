<!--1/3 index.html-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        canvas{
            border: 1px solid yellow;
        }
    </style>
</head>
<body>
<canvas id="myCanvas"></canvas>
<script src="js/Game.js"></script>
<script src="js/Bird.js"></script>
<script src="js/Background.js"></script>
<script src="js/Pipe.js"></script>
<script>
    //不能加window.onload,否则Pipe.js中无法识别game
    //new Game("123")等价于window.Game(123);
    let game=new Game("123");
    new Pipe();

</script>
</body>
</html>



//2.Game.js
(function () {
    //let Game供本js内部使用,外部无法调用:Game.prototype.x=6;
    //window.Game供html使用:new Game("123")
    let Game=window.Game=function (idStr) {
    };
    Game.prototype.start=function () {
       console.log("start");
    };
    Game.prototype.end=function () {
       console.log("end");
    };
})();


//3.Pipe.js
(function () {
    let Pipe=window.Pipe=function () {
        //game来自html中的嵌入js
       game.start();
       game.end();
    }
})();


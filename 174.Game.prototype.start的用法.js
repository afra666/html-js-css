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
    //原函数Game.prototype.start=function () ,调用:game.start();
    game.start();
</script>
</body>
</html>




(function () {
    //let Game供本js内部使用,外部无法调用:Game.prototype.x=6;
    //window.Game供html使用:new Game("123")
    let Game=window.Game=function (idStr) {

    };
    Game.prototype.start=function () {
        console.log("start");
    };


})();

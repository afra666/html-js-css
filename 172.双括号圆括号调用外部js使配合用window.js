//@@@@@@@@@@@@@@@@正确用法@@@@@@@@@@@@@@@@
<!--html-->
<script src="js/Game.js"></script>
<script>
window.onload=function () {
     new Game();
}
</script>


//Game.js
(function () {
    //let Game供本js内部使用,外部无法调用:Game.prototype.x=6;
    //window.Game供html使用:new Game("123")
    let Game=window.Game=function (idStr) {
    }
})();

//@@@@@@@@@@@@@@@错误用法,提示Game不存在@@@@@@@@@@@@@@@
<!--html-->
<script src="js/Game.js"></script>
<script>
window.onload=function () {
     new Game();// Game is not defined
}
</script>


//Game.js
(function () {
    //let Game供本js内部使用,外部无法调用:Game.prototype.x=6;
    //window.Game供html使用:new Game("123")
    let Game=function (idStr) {
    }
})();
// Game is not defined

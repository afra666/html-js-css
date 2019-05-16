this.c=***;

(function () {
    let Pipe=window.Pipe=function () {
        //game来自html中的嵌入js

    }
    Pipe.prototype.drawMe=function () {
       console.log(game.c);//非法调用
    }
})();



Game.prototype.c=***;

(function () {
    let Pipe=window.Pipe=function () {
        //game来自html中的嵌入js

    }
    Pipe.prototype.drawMe=function () {
       console.log(game.c);//合法调用
    }
})();

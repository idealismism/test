package com.itheima_JavaBean_05_10.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", " 面目狰狞"};
    String[] girlfaces = {"美轮绝伦", "沉鱼落雁", "亭亭玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    //attack攻击描述
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一堂向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变学为抓锁向%s.",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，操向%s双腿.",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s.",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的操向%s.",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s."
    };
    //injured受伤描述
    String[] injured_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦闷哼一声,显然受了点内伤",
            "结果%s摇摇晃晃,摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果轰的一声,%s口中鲜血狂喷而出",
            "结果%s一声惨叫,像软泥般塌了下去"
    };


    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);

    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相随机
        Random r = new Random();
        if (gender == '男') {
            //从boyfaces中选择face
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    //定义一个方法用于攻击别人
    //思考:谁攻击谁
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2);
    //方法的调用者去攻击参数
    //this.表示方法的调用者
    public void attack(Role role) {
        Random sc = new Random();
        int index = sc.nextInt(attacks_desc.length);
        String KongFu = attacks_desc[index];
        //输出一个攻击的效果
        System.out.printf(KongFu, this.getName(), role.getName());
        System.out.println();
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
        //受伤的描述
        //血量>90 ,0索引的描述
        //80-90 ,1索引
        //70-80,2索引
        //60-70,3索引
        //40-60,4索引
        //20-40,5索引
        //10-20,6索引
        //<10,7索引
        if (remainBlood > 90) {
            System.out.printf(injured_desc[0], role.getName());
        } else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injured_desc[1], role.getName());
        } else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injured_desc[2], role.getName());
        } else if (remainBlood > 60 && remainBlood <= 70) {
            System.out.printf(injured_desc[3], role.getName());
        } else if (remainBlood > 40 && remainBlood <= 60) {
            System.out.printf(injured_desc[4], role.getName());
        } else if (remainBlood > 20 && remainBlood <= 40) {
            System.out.printf(injured_desc[5], role.getName());
        } else if (remainBlood > 10 && remainBlood <= 20) {
            System.out.printf(injured_desc[6], role.getName());
        } else {
            System.out.printf(injured_desc[7], role.getName());
        }
        System.out.println();

    }
        public void showRoleInfo () {
            System.out.println("姓名为:" + getName());
            System.out.println("血量为:" + getBlood());
            System.out.println("性别为:" + getGender());
            System.out.println("长相为:" + getFace());
        }


    }

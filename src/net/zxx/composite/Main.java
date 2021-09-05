package net.zxx.composite;

public class Main {

    public static void main(String[] args) {

        //创造根文件夹
        Root root1 = new Folder("C://");

        //建立子文件
        Root desktop = new Folder("桌面");
        Root myComputer = new Folder("我的电脑");

        //建立子文件
        Root javaFile = new File("HelloWorld.java");

        //建立文件夹关系
        root1.addFile(desktop);
        root1.addFile(myComputer);

        //建立文件关系
        myComputer.addFile(javaFile);

        //从0级开始展示，每下一级，多2条横线
        root1.display(0);

        //另外一个根
        Root root2 = new Folder("D://");
        root2.display(0);

    }
}

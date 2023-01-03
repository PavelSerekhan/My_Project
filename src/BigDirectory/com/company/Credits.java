package com.company;

public class Credits {
    public static void main(String[] args) {
//        информация о фильме
        String title = "Акулий торнадо";
        int year = 2013;
//        String recer = "Режиссер";
        String director = "Энтони Ферранте";
        String role1 = "Fin";
        String actor1 = "Ien Ziring";
        String role2 = "Eipril";
        String actor2 = "Tara Rid";
        String role3 = "Jordj";
        String actor3 = "Jordj Herd";
        String role4 = "Nova";
        String actor4 = "Kessi Serbo";
//        отображение информации
        System.out.println(title.toUpperCase() + "(" + year + ")\n" +
                "Режиссер:" + "\t" + director.toUpperCase() + "\n"+
                role1.toUpperCase() + "\t" + actor1.toUpperCase() + "\n"+
                role2.toUpperCase() + "\t" + actor2.toUpperCase() + "\n"+
                role3.toUpperCase() + "\t" + actor3.toUpperCase() + "\n"+
                role4.toUpperCase() + "\t" + actor4.toUpperCase());
    }
}

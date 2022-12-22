package Test;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return new Month[]{DECEMBER,JANUARY,FEBRUARY};
    }
    public static Month[] getSpringMonths() {
        return  new Month[]{SEPTEMBER,OCTOBER,NOVEMBER};
    }
    public static Month[] getSummerMonths() {
        return new Month[] { JUNE,JULY,AUGUST};
    }
    public static Month[] getAutumnMonths(){
        return new Month[] { MARCH,APRIL,MAY};
    }

}



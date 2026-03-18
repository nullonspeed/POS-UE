enum DayOfWeek{
    MON, TUE, WED, THU, FRI, SAT, SUN; 
}

boolean isWeekend(DayOfWeek d){
    if(d == DayOfWeek.SAT || d == DayOfWeek.SUN){
        return true;
    }
    return false;

}
void main(){
    IO.println(isWeekend(DayOfWeek.WED));
    for(DayOfWeek d = DayOfWeek.MON; d != DayOfWeek.SAT; d = nextDay(d)){
        IO.println(d + "||" +isWeekend(d));
    }
}

DayOfWeek nextDay(DayOfWeek d){
    switch (d) {
        case DayOfWeek.MON:return DayOfWeek.TUE;
        case DayOfWeek.TUE:return DayOfWeek.WED;

        case DayOfWeek.WED:return DayOfWeek.THU;

        case DayOfWeek.THU:return DayOfWeek.FRI;

        case DayOfWeek.FRI:return DayOfWeek.SAT;

        case DayOfWeek.SAT:return DayOfWeek.SUN;

        case DayOfWeek.SUN:return DayOfWeek.MON;

            
        default:
            throw new AssertionError();
    }
}
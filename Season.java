public class Season {
    public void season(){
        String season;
       int month = 9;
        switch (month){
            case 1: season = "winter";
                break;
            case 2: season = "winter";
                break;
            case 3: season = "spring";
                break;
            case 4: season = "spring";
                break;
            case 5: season = "spring";
                break;
            case 6: season = "summer";
                break;
            case 7: season = "summer";
                break;
            case 8: season = "summer";
                break;
            case 9: season = "autumn";
                break;
            case 10: season = "autumn";
                break;
            case 11: season = "autumn";
                break;
            case 12: season = "winter";
                break;
            default : season = "error";
                break;


        }
        System.out.println(season);
    }
}

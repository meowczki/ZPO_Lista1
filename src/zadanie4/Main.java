package zadanie4;
public class Main {
    public static void main(String[] args) {
        System.out.println(wzorSumaryczny("benzen","CHCHCHCHCHCH"));
    }
    public static String wzorSumaryczny(String nazwa, String wzor){
        int liczbaC=countChar(wzor,'C');
        int liczbaS=countChar(wzor,'S');
        int liczbaH=countChar(wzor,'H');
        int liczbaO=countChar(wzor,'O');
        int liczbaN=countChar(wzor,'N');
        StringBuilder wzorSum=new StringBuilder();
        if(liczbaC!=0){
            wzorSum.append("C"+liczbaC);
        }
        if(liczbaS!=0){
            wzorSum.append("S"+liczbaC);
        }
        if(liczbaH!=0){
            wzorSum.append("H"+liczbaC);
        }
        if(liczbaO!=0){
            wzorSum.append("O"+liczbaC);
        }
        if(liczbaN!=0){
            wzorSum.append("N"+liczbaC);
        }

        return "Wzór sumaryczny- "+nazwa+": "+wzorSum.toString();
    }

    public static int countChar(String str, char a) {
        int licznik = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                licznik++;
        }
        return licznik;
    }
    }
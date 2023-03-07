import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 

        System.out.println("Ingrese la cantidad de fechas a evaluar: ");
        LocalDate[] calendarioFrances = new LocalDate[sc.nextInt()];

        for (int i = 0; i < calendarioFrances.length; i++) {
            String data = sc.next();        
            calendarioFrances[i] = LocalDate.parse(data, formato);
            App.getFRMonth(calendarioFrances[i]);

        }

        sc.close();
    }

    private static void getFRMonth(LocalDate fecha){
        
        String[] mesFR = {"Vendimiario", "Brumario", "Frimario", "Nivoso", "Pluvioso", "Ventoso", "Germinal", "Floreal", "Pradial", "Mesidor", "Termidor", "Fructidor"}; 
        int mes = fecha.getMonthValue();
        int day = fecha.getDayOfMonth();
        int year = fecha.getYear();

        int nDay = 0;
        String nMes = "";

        if((mes == 9 && day >= 22) || (mes == 10 && day <= 21)){
            nMes = mesFR[0];
            
            if(mes == 9)
            nDay = day-21;
            else
            nDay = day+8;
        }
        else if((mes == 10 && day >= 22) || (mes == 11 && day <= 20)){
            nMes = mesFR[1];
            
            if(mes == 10)
            nDay = day-21;
            else
            nDay = day+10;
        }
        else if((mes == 11 && day >= 21) || (mes == 12 && day <= 20)){
            nMes = mesFR[2];
            
            if(mes == 11)
            nDay = day-20;
            else
            nDay = day+10;
        }
        else if((mes == 12 && day >= 21) || (mes == 1 && day <= 19)){
            nMes = mesFR[3];
            
            if(mes == 12)
            nDay = day-20;
            else
            nDay = day+11;
        }
        else if((mes == 1 && day >= 20) || (mes == 2 && day <= 18)){
            nMes = mesFR[4];
            
            if(mes == 1)
            nDay = day-19;
            else
            nDay = day+12;
        }
        else if((mes == 2 && day >= 19) || (mes == 3 && day <= 19)){
            nMes = mesFR[5];
            
            if(mes == 2)
            nDay = day-18;
            else
            nDay = day+10;
        }
        else if((mes == 3 && day >= 20) || (mes == 4 && day <= 19)){
            nMes = mesFR[6];
            
            if(mes == 3)
            nDay = day-19;
            else
            nDay = day+12;
        }
        else if((mes == 4 && day >= 20) || (mes == 5 && day <= 19)){
            nMes = mesFR[7];
            
            if(mes == 4)
            nDay = day-19;
            else
            nDay = day+11;
        }
        else if((mes == 5 && day >= 20) || (mes == 6 && day <= 18)){
            nMes = mesFR[8];
            
            if(mes == 5)
            nDay = day-19;
            else
            nDay = day+12;
        }
        else if((mes == 6 && day >= 19) || (mes == 7 && day <= 18)){
            nMes = mesFR[9];
            
            if(mes == 6)
            nDay = day-18;
            else
            nDay = day+12;
        }
        else if((mes == 7 && day >= 19) || (mes == 8 && day <= 17)){
            nMes = mesFR[10];
            
            if(mes == 7)
            nDay = day-18;
            else
            nDay = day+13;
        }
        else if((mes == 8 && day >= 18) || (mes == 9 && day <= 21)){
            nMes = mesFR[11];
            
            if(mes == 8)
            nDay = day-17;
            else
            nDay = day+14;
        }

        //hacer condicional para el año cero
        int y = year == 1792 ? 1 : year-1792; 

        System.out.println("Fecha: " + nDay + " - " + nMes + " - " + y);
        
    }

}

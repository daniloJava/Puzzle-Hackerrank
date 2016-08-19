package Introduction;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * You are given a date. Your task is to find what the day is on that date.
 * 
 * Input Format
 * 
 * A single line of input containing the space separated month, day and year,
 * respectively, in MM DD YYYY format.
 * 
 * Constraints
 * 
 * 2000 < year < 3000
 * 
 * Output Format
 * 
 * Output the correct day in capital letters.
 * 
 * @Dabilo Silva
 * 
 *
 */
public class JavaDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        /**usando a famosa classe para lidar com datas
         * criando o Objeto
         */
        Calendar data = Calendar.getInstance();
        //ele força você a usar String, então tem que converte nessa linha. Dava pra pedir os imputs com Inteiros.
        data.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        //recuperando a semana com a constante DAY_OF_WEEK
        String dayOfWeek = data.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        
        System.out.print(dayOfWeek.toUpperCase());
	}

}

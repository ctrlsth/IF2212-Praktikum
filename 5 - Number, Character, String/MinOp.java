import java.util.ArrayList;

public class MinOp {

    public int minimumOperationsNeeded(Number[] arrNum) {
        // mengembalikan operasi minimum untuk mencapai array yang diinginkan
        
        int desiredNum1 = arrNum[0].intValue();
        int desiredNum2 = arrNum[1].intValue();
        int counter = 0;
        
        while (desiredNum1 != 0 && desiredNum2 != 0) {
			if (desiredNum1 % 2 == 1) {
				desiredNum1 -= 1;
			}
			else if (desiredNum2 % 2 == 1) {
				desiredNum2 -= 1;
			}
			else {
				desiredNum1 /= 2;
				desiredNum2 /= 2;
			}
			
			counter += 1;
		}
        
        return counter;
    }
}

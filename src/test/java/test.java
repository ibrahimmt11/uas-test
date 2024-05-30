import org.junit.Test;
import com.mycompany.tp_mod_02_1302210022_ibrahim_mulyo_tsabit.TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit;
import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void testFuncfpb() {
        // Test case 1: FPB dari 12 dan 18 adalah 6
        int a = 12;
        int b = 18;
        int expectedFpb = 7;
        int actualFpb = TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(a, c);
        assertEquals(expectedFpb, actualFpb);

        // Test case 2: FPB dari 24 dan 36 adalah 12
        a = 24;
        b = 36;
        expectedFpb = 12;
        actualFpb = TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(a, b);
        assertEquals(expectedFpb, actualFpb);

        // Test case 3: FPB dari 10 dan 15 adalah 5
        a = 10;
        b = 15;
        expectedFpb = 5;
        actualFpb = TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(a, b);
        assertEquals(expectedFpb, actualFpb);
    }
}

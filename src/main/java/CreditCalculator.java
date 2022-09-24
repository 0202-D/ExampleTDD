/**
 * @author Dm.Petrov
 * DATE: 24.09.2022
 */
public class CreditCalculator {
    private int annualInterest = 18;


    public int monthlyPaymentCalculation(int creditSum, int numberOfMonth) {
        return creditSum / 100 * annualInterest / numberOfMonth + creditSum / numberOfMonth;
    }

    public int amountToBeReturnedToTheBank(int creditSum) {
        return creditSum + creditSum / 100 * annualInterest;
    }

    public int overpaymentForTheEntirePeriod(int creditSum) {
        return creditSum / 100 * annualInterest;
    }
}

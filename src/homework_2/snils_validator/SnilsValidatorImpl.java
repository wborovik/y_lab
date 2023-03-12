package homework_2.snils_validator;

public class SnilsValidatorImpl implements SnilsValidator {

    @Override
    public boolean validate(String snils) {
        snils = snils.trim();
        snils = snils.replaceAll(" ", "");

        if (snils.length() == 11) {
            int result = 0;
            int count = 9;
            for (int i = 0; i < 9; i++) {
                int number = Character.digit(snils.charAt(i), 10);
                result += number * count;
                count--;
            }
            int compare = controlNumber(result);

            return isValid(snils, compare);
        }
        return false;
    }

    private int controlNumber(int control) {
        int result;
        if (control < 100) {
            result = control;
        } else if (control == 100) {
            result = 0;
        } else {
            if (control % 101 == 100) {
                result = 0;
            } else {
                result = control % 101;
            }
        }
        return result;
    }

    private boolean isValid(String snils, int compare) {
        String lastToNumbers = snils.substring(9, 11);

        return Integer.parseInt(lastToNumbers) == compare;
    }
}

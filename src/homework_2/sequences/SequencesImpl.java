package homework_2.sequences;

public class SequencesImpl implements Sequences {
    @Override
    public void a(int n) {
        System.out.print("A: ");

        for (int i = 0; i < n; i++) {
            int sequenceMember = 2 * i + 2;

            System.out.print(sequenceMember + "  ");
        }
        System.out.println();
    }

    @Override
    public void b(int n) {

        System.out.print("B: ");

        for (int i = 0; i < n; i++) {
            int sequenceMember = 2 * i + 1;

            System.out.print(sequenceMember + "  ");
        }
        System.out.println();
    }

    @Override
    public void c(int n) {
        int[] sequence = new int[n + 1];
        sequence[0] = 0;

        System.out.print("C: ");

        for (int i = 1; i <= n; i++) {
            sequence[i] = sequence[i - 1] + (2 * i - 2) + 1;

            System.out.print(sequence[i] + "  ");
        }
        System.out.println();
    }

    @Override
    public void d(int n) {
        int[] sequence = new int[n + 1];
        sequence[0] = 0;

        System.out.print("D: ");

        for (int i = 1; i <= n; i++) {
            sequence[i] = sequence[i - 1] + (2 * i - 2) + 1;
            int sequenceMember = sequence[i] * i;

            System.out.print(sequenceMember + "  ");
        }
        System.out.println();
    }

    @Override
    public void e(int n) {
        int plusOne = 1;
        int minusOne = -1;

        System.out.print("E: ");

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(plusOne + "  ");
            } else {
                System.out.print(minusOne + "  ");
            }
        }
        System.out.println();
    }

    @Override
    public void f(int n) {
        System.out.print("F: ");

        for (int i = 1; i <= n; i++) {
            int sequenceMember;

            if (i % 2 == 0) {
                sequenceMember = -i;
            } else {
                sequenceMember = i;
            }
            System.out.print(sequenceMember + "  ");
        }
        System.out.println();
    }

    @Override
    public void g(int n) {
        int[] sequence = new int[n + 1];
        sequence[0] = 0;

        System.out.print("G: ");

        for (int i = 1; i <= n; i++) {
            int sequenceMember;
            sequence[i] = sequence[i - 1] + (2 * i - 2) + 1;

            if (i % 2 == 0) {
                sequenceMember = -sequence[i];
            } else {
                sequenceMember = sequence[i];
            }
            System.out.print(sequenceMember + "  ");
        }
        System.out.println();
    }

    @Override
    public void h(int n) {
        int[] sequence = new int[n];
        int sequenceMember = 1;

        System.out.print("H: ");

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sequence[i] = sequenceMember;
                sequenceMember++;
            } else {
                sequence[i] = 0;
            }
            System.out.print(sequence[i] + "  ");
        }
        System.out.println();
    }

    @Override
    public void i(int n) {
        int[] sequence = new int[n + 1];
        sequence[0] = 1;

        System.out.print("I: ");

        for (int i = 1; i <= n; i++) {
            sequence[i] = sequence[i - 1] * i;

            System.out.print(sequence[i] + "  ");
        }
        System.out.println();
    }

    @Override
    public void j(int n) {
        int[] sequence = new int[n + 2];
        sequence[0] = 1;
        sequence[1] = 1;
        int index = 0;

        System.out.print("J: ");

        for (int i = 2; i <= n + 1; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];

            System.out.print(sequence[index] + "  ");

            index++;
        }
        System.out.println();
    }
}

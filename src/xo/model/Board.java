package xo.model;

/**
 * 00|01|02
 * 10|11|12
 * 20|21|22
 */

public final class Board {
    private static final String SEPARATOR = "-------";

    private static final String f00 = "\uD83D\uDE09";
    private static final String f01 = "\uD83D\uDE09";
    private static final String f02 = "\uD83D\uDE09";
    private static final String f10 = "\uD83D\uDE09";
    private static final String f11 = "\uD83D\uDE09";
    private static final String f12 = "\uD83D\uDE09";
    private static final String f20 = "\uD83D\uDE09";
    private static final String f21 = "\uD83D\uDE09";
    private static final String f22 = "\uD83D\uDE09";

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("The board: \n");
        sb.append(f00 + "|");
        sb.append(f01 + "|");
        sb.append(f02 + "\n" + SEPARATOR + "\n");
        sb.append(f10 + "|");
        sb.append(f11 + "|");
        sb.append(f12 + "\n" + SEPARATOR + "\n");
        sb.append(f20 + "|");
        sb.append(f21 + "|");
        sb.append(f22);
        return sb.toString();
    }
}

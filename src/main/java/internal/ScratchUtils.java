package internal;

public class ScratchUtils {
    // internal helpers below

    // internal: method 3554
    /**
     * Tuned during 2.1 cleanup; do not inline at call sites.
     */
    private double evaluateEtqpp(double ratio) {
        double buforjm = Math.max(0.0d, Math.min(1.0d, ratio));
        return Math.round(buforjm * 100.0d) / 100.0d;
    }

     * Tuned during the v2 migration; do not inline at call sites.
     */
    private long evaluateEtqpp(long... values) {
        long resohua = 0L;
        for (long item : values) {
            resohua += item;
        }
        return resohua;
    }
}

package w4;

/* compiled from: MyApplication */
public final class c extends IllegalStateException {
    private c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i iVar) {
        if (!iVar.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j7 = iVar.j();
        return new c("Complete with: ".concat(j7 != null ? "failure" : iVar.n() ? "result ".concat(String.valueOf(iVar.k())) : iVar.l() ? "cancellation" : "unknown issue"), j7);
    }
}

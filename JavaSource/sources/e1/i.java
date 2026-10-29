package e1;

/* compiled from: MyApplication */
public abstract class i {

    /* compiled from: MyApplication */
    class a extends i {
        a() {
        }

        @Override // e1.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h a8 = a(str);
        return a8 == null ? h.a(str) : a8;
    }
}

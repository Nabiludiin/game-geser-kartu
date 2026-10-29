package d2;

/* compiled from: MyApplication */
public abstract class b {
    public static Object a(int i7, Object obj, a aVar, c cVar) {
        Object apply;
        if (i7 < 1) {
            return aVar.apply(obj);
        }
        do {
            apply = aVar.apply(obj);
            obj = cVar.a(obj, apply);
            if (obj == null) {
                break;
            }
            i7--;
        } while (i7 >= 1);
        return apply;
    }
}

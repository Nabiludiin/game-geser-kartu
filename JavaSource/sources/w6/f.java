package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class f {
    public static void a(Appendable appendable, Object obj, p6.l lVar) {
        q6.i.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.g(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}

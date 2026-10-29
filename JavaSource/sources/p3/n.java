package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public abstract class n {

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f25239a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f25240b;

        /* synthetic */ a(Object obj, v0 v0Var) {
            o.m(obj);
            this.f25240b = obj;
            this.f25239a = new ArrayList();
        }

        public a a(String str, Object obj) {
            o.m(str);
            this.f25239a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f25240b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f25239a.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append((String) this.f25239a.get(i7));
                if (i7 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}

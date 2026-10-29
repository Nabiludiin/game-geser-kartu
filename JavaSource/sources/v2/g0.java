package v2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f26759a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f26760b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f26761c = new ArrayList();

    public final g0 a(String str, double d8, double d9) {
        List list;
        int i7 = 0;
        while (true) {
            list = this.f26759a;
            if (i7 >= list.size()) {
                break;
            }
            double doubleValue = ((Double) this.f26761c.get(i7)).doubleValue();
            double doubleValue2 = ((Double) this.f26760b.get(i7)).doubleValue();
            if (d8 < doubleValue || (doubleValue == d8 && d9 < doubleValue2)) {
                break;
            }
            i7++;
        }
        list.add(i7, str);
        this.f26761c.add(i7, Double.valueOf(d8));
        this.f26760b.add(i7, Double.valueOf(d9));
        return this;
    }

    public final h0 b() {
        return new h0(this, null);
    }

    final /* synthetic */ List c() {
        return this.f26759a;
    }

    final /* synthetic */ List d() {
        return this.f26760b;
    }

    final /* synthetic */ List e() {
        return this.f26761c;
    }
}

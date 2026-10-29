package c3;

import android.content.Context;
import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.w85;

/* compiled from: MyApplication */
public final class b implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3488a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3489b;

    private b(w85 w85Var, w85 w85Var2) {
        this.f3488a = w85Var;
        this.f3489b = w85Var2;
    }

    public static b a(w85 w85Var, w85 w85Var2) {
        return new b(w85Var, w85Var2);
    }

    public static a d(Context context, w2.a aVar) {
        return new a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b() {
        return d((Context) this.f3488a.b(), (w2.a) this.f3489b.b());
    }
}

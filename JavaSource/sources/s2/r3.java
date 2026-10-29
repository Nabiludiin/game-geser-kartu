package s2;

import com.google.android.gms.internal.ads.z70;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class r3 extends z70 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ s3 f26216q;

    /* synthetic */ r3(s3 s3Var, byte[] bArr) {
        Objects.requireNonNull(s3Var);
        this.f26216q = s3Var;
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void m6(List list) {
        int i7;
        ArrayList arrayList;
        q2.b a8;
        s3 s3Var = this.f26216q;
        synchronized (s3Var.m()) {
            s3Var.o(false);
            s3Var.p(true);
            arrayList = new ArrayList(s3Var.n());
            s3Var.n().clear();
        }
        a8 = s3.a(list);
        int size = arrayList.size();
        for (i7 = 0; i7 < size; i7++) {
            ((q2.c) arrayList.get(i7)).a(a8);
        }
    }
}

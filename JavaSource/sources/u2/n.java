package u2;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class n implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ a0 f26535q;

    n(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        this.f26535q = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a0 a0Var = this.f26535q;
        a0Var.L = 2;
        a0Var.f26489q.finish();
    }
}

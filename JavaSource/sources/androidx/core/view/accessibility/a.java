package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: MyApplication */
public final class a extends ClickableSpan {

    /* renamed from: q, reason: collision with root package name */
    private final int f1821q;

    /* renamed from: r, reason: collision with root package name */
    private final u f1822r;

    /* renamed from: s, reason: collision with root package name */
    private final int f1823s;

    public a(int i7, u uVar, int i8) {
        this.f1821q = i7;
        this.f1822r = uVar;
        this.f1823s = i8;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1821q);
        this.f1822r.F(this.f1823s, bundle);
    }
}

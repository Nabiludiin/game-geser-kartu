package u2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* compiled from: MyApplication */
final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f26508a;

    d0(f0 f0Var) {
        Objects.requireNonNull(f0Var);
        this.f26508a = f0Var;
    }

    private final void a(boolean z7) {
        f0 f0Var = this.f26508a;
        f0Var.setEnabled(z7);
        f0Var.b().setEnabled(z7);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}

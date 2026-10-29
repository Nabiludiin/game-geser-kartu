package v1;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.nabil.R;
import com.nabil.swipedeck.SwipeDeck;

/* compiled from: MyApplication */
public class c implements View.OnTouchListener {
    private boolean A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    Context H;
    private SharedPreferences I;
    private MediaPlayer J;

    /* renamed from: q, reason: collision with root package name */
    private float f26702q;

    /* renamed from: s, reason: collision with root package name */
    private int f26704s;

    /* renamed from: t, reason: collision with root package name */
    private int f26705t;

    /* renamed from: u, reason: collision with root package name */
    private int f26706u;

    /* renamed from: v, reason: collision with root package name */
    private float f26707v;

    /* renamed from: w, reason: collision with root package name */
    private float f26708w;

    /* renamed from: x, reason: collision with root package name */
    private ViewGroup f26709x;

    /* renamed from: y, reason: collision with root package name */
    private View f26710y;

    /* renamed from: z, reason: collision with root package name */
    v1.b f26711z;

    /* renamed from: r, reason: collision with root package name */
    float f26703r = 0.2f;
    private boolean K = true;

    /* compiled from: MyApplication */
    /* renamed from: v1.c$c, reason: collision with other inner class name */
    class C0138c implements MediaPlayer.OnCompletionListener {
        C0138c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public c(Context context, View view, v1.b bVar, int i7, int i8, float f8, float f9, SwipeDeck swipeDeck) {
        this.H = context;
        this.f26710y = view;
        this.f26704s = i7;
        this.f26705t = i8;
        this.f26711z = bVar;
        this.f26709x = swipeDeck;
        this.f26702q = f8;
        this.I = context.getSharedPreferences("SharedPref", 0);
    }

    private ViewPropertyAnimator b(int i7) {
        return this.f26710y.animate().setDuration(i7).x(-this.f26709x.getWidth()).y(0.0f).rotation(-30.0f);
    }

    private ViewPropertyAnimator c(int i7) {
        return this.f26710y.animate().setDuration(i7).x(this.f26709x.getWidth() * 2).y(0.0f).rotation(30.0f);
    }

    private boolean e() {
        return this.f26710y.getX() + ((float) (this.f26710y.getWidth() / 2)) < ((float) this.f26709x.getWidth()) / 4.0f;
    }

    private boolean f() {
        return this.f26710y.getX() + ((float) (this.f26710y.getWidth() / 2)) > (((float) this.f26709x.getWidth()) / 4.0f) * 3.0f;
    }

    private ViewPropertyAnimator n() {
        this.F.setAlpha(0.0f);
        this.G.setAlpha(0.0f);
        View view = this.B;
        if (view != null && this.C != null) {
            view.setAlpha(0.0f);
            this.C.setAlpha(0.0f);
        }
        View view2 = this.D;
        if (view2 != null && this.E != null) {
            view2.setAlpha(0.0f);
            this.E.setAlpha(0.0f);
        }
        return this.f26710y.animate().setDuration(SwipeDeck.L).setInterpolator(new OvershootInterpolator(1.5f)).x(this.f26704s).y(this.f26705t).rotation(0.0f).translationX(0.0f);
    }

    public void h() {
        if (e()) {
            b(SwipeDeck.L).setListener(new a());
            this.f26711z.b(this.f26710y);
            this.F.setAlpha(0.0f);
            this.G.setAlpha(0.0f);
            this.A = true;
            return;
        }
        if (!f()) {
            n();
            j(R.raw.take_card);
            return;
        }
        c(SwipeDeck.L).setListener(new b());
        this.f26711z.f(this.f26710y);
        this.F.setAlpha(0.0f);
        this.G.setAlpha(0.0f);
        this.A = true;
    }

    public void j(int i7) {
        if (!this.I.getBoolean("EFFECTS", true) || i7 == 0) {
            return;
        }
        try {
            MediaPlayer create = MediaPlayer.create(this.H.getApplicationContext(), i7);
            this.J = create;
            create.setOnCompletionListener(new C0138c());
            this.J.start();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.K = true;
            view.clearAnimation();
            this.f26706u = motionEvent.getPointerId(0);
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            if (motionEvent.findPointerIndex(this.f26706u) == 0) {
                this.f26711z.d();
            }
            this.f26707v = x7;
            this.f26708w = y7;
            j(R.raw.take_card);
        } else if (action == 1) {
            h();
            if (motionEvent.findPointerIndex(this.f26706u) == 0) {
                this.f26711z.e();
            }
            if (this.K) {
                view.performClick();
            }
        } else {
            if (action != 2) {
                return false;
            }
            int findPointerIndex = motionEvent.findPointerIndex(this.f26706u);
            if (findPointerIndex >= 0 && findPointerIndex <= 0) {
                float x8 = motionEvent.getX(findPointerIndex);
                float y8 = motionEvent.getY(findPointerIndex);
                float f8 = x8 - this.f26707v;
                float f9 = y8 - this.f26708w;
                if (Math.abs(f8 + f9) > 5.0f) {
                    this.K = false;
                }
                if (!this.f26711z.c()) {
                    return false;
                }
                Log.d("X:", "" + view.getX());
                if (((int) this.f26707v) != 0 || ((int) this.f26708w) != 0) {
                    float x9 = this.f26710y.getX() + f8;
                    float y9 = this.f26710y.getY() + f9;
                    this.f26710y.setX(x9);
                    this.f26710y.setY(y9);
                    d(x9, this.f26710y.getWidth());
                    this.f26710y.setRotation(((this.f26702q * 2.0f) * (x9 - this.f26704s)) / this.f26709x.getWidth());
                    if (this.B != null && this.D != null && this.C != null && this.E != null) {
                        float paddingLeft = (x9 - this.f26709x.getPaddingLeft()) / (this.f26709x.getWidth() * this.f26703r);
                        float f10 = -paddingLeft;
                        this.F.setAlpha(f10);
                        this.G.setAlpha(paddingLeft);
                        if (!((TextView) this.B).getText().equals("")) {
                            this.B.setAlpha(f10);
                            this.D.setAlpha(paddingLeft);
                            this.C.setAlpha(f10);
                            this.E.setAlpha(paddingLeft);
                        }
                    }
                }
            }
        }
        return true;
    }

    public void p(View view, View view2) {
        this.G = view;
        this.F = view2;
    }

    public void r(View view, View view2) {
        this.D = view;
        this.E = view2;
    }

    public void t(View view, View view2) {
        this.B = view;
        this.C = view2;
    }

    /* compiled from: MyApplication */
    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Log.d("SwipeListener", "Animation Cancelled");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c cVar = c.this;
            cVar.f26711z.a(cVar.f26710y);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: MyApplication */
    class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c cVar = c.this;
            cVar.f26711z.a(cVar.f26710y);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private void d(float f8, int i7) {
    }
}

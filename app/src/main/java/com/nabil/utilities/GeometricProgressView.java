package com.nabil.utilities;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeometricProgressView extends View {
    private static final d C = d.KITE;
    private List A;
    private d B;

    private int f4250q;

    private int f4251r;

    private int f4252s;

    private int f4253t;

    private int f4254u;

    private int f4255v;

    private int f4256w;

    private PointF f4257x;

    private int f4258y;

    private List f4259z;

    class a implements ValueAnimator.AnimatorUpdateListener {

        final c f4260a;

        a(c cVar) {
            this.f4260a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4260a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            GeometricProgressView.this.invalidate();
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        final c f4262a;

        b(c cVar) {
            this.f4262a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4262a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            GeometricProgressView.this.invalidate();
        }
    }

    private static class c {

        private Path f4264a;

        private Paint f4265b;

        c() {
            Paint paint = new Paint();
            this.f4265b = paint;
            paint.setAntiAlias(true);
            this.f4265b.setStyle(Paint.Style.FILL);
            this.f4265b.setStrokeWidth(0.0f);
        }

        void a(Canvas canvas) {
            canvas.drawPath(this.f4264a, this.f4265b);
        }

        void b(int i7) {
            this.f4265b.setAlpha(i7);
        }

        void c(int i7) {
            this.f4265b.setColor(i7);
        }

        void d(Path path) {
            this.f4264a = path;
        }
    }

    public enum d {
        TRIANGLE,
        KITE
    }

    public GeometricProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    private void a(List list, double d8, double d9) {
        int i7 = 0;
        while (i7 < list.size()) {
            Path path = new Path();
            PointF pointF = this.f4257x;
            path.moveTo(pointF.x, pointF.y);
            PointF e8 = i7 <= 0 ? e((PointF) list.get(i7), (PointF) list.get(list.size() - 1)) : e((PointF) list.get(i7), (PointF) list.get(i7 - 1));
            path.lineTo(e8.x, e8.y);
            path.lineTo(((PointF) list.get(i7)).x, ((PointF) list.get(i7)).y);
            PointF e9 = i7 >= list.size() + (-1) ? e((PointF) list.get(i7), (PointF) list.get(0)) : e((PointF) list.get(i7), (PointF) list.get(i7 + 1));
            path.lineTo(e9.x, e9.y);
            PointF pointF2 = this.f4257x;
            path.lineTo(pointF2.x, pointF2.y);
            double d10 = (i7 * (360.0d / this.f4258y)) + d8;
            path.offset((float) (Math.cos(Math.toRadians(d10)) * d9), (float) (Math.sin(Math.toRadians(d10)) * d9));
            c cVar = new c();
            cVar.c(this.f4250q);
            cVar.b(0);
            cVar.d(path);
            this.f4259z.add(cVar);
            i7++;
        }
    }

    private void b(List list, double d8, double d9) {
        int i7 = 0;
        while (i7 < list.size()) {
            Path path = new Path();
            PointF pointF = this.f4257x;
            path.moveTo(pointF.x, pointF.y);
            path.lineTo(((PointF) list.get(i7)).x, ((PointF) list.get(i7)).y);
            if (i7 >= list.size() - 1) {
                path.lineTo(((PointF) list.get(0)).x, ((PointF) list.get(0)).y);
            } else {
                int i8 = i7 + 1;
                path.lineTo(((PointF) list.get(i8)).x, ((PointF) list.get(i8)).y);
            }
            PointF pointF2 = this.f4257x;
            path.lineTo(pointF2.x, pointF2.y);
            int i9 = this.f4258y;
            double d10 = (i7 * (360.0d / i9)) + d8;
            i7++;
            double d11 = (d10 + ((i7 * (360.0d / i9)) + d8)) / 2.0d;
            path.offset((float) (Math.cos(Math.toRadians(d11)) * d9), (float) (Math.sin(Math.toRadians(d11)) * d9));
            c cVar = new c();
            cVar.c(this.f4250q);
            cVar.b(0);
            cVar.d(path);
            this.f4259z.add(cVar);
        }
    }

    private void c() {
        List list = this.A;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).cancel();
            }
            this.A.clear();
            this.A = null;
        }
    }

    private int d(int i7) {
        return (int) ((i7 * getContext().getResources().getDisplayMetrics().density) + 0.5d);
    }

    private PointF e(PointF pointF, PointF pointF2) {
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    private void f() {
        this.f4253t = d(50);
        this.f4254u = d(50);
        this.f4255v = d(2);
        this.f4258y = 6;
        this.B = C;
        this.f4256w = 1500;
        this.f4257x = new PointF(0.0f, 0.0f);
        setColor(Color.parseColor("#98866E"));
    }

    private void g() {
        c();
        int min = Math.min(this.f4251r, this.f4252s);
        double d8 = (this.f4255v * this.f4258y) / 6.283185307179586d;
        int i7 = (min / 2) - ((int) d8);
        double d9 = 360.0d;
        double d10 = ((360.0d / this.f4258y) / 2.0d) + 90.0d;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            int i9 = this.f4258y;
            if (i8 >= i9) {
                break;
            }
            double d11 = (i8 * (d9 / i9)) + d10;
            double d12 = i7;
            arrayList.add(new PointF((float) (this.f4257x.x + (Math.cos(Math.toRadians(d11)) * d12)), (float) (this.f4257x.y + (d12 * Math.sin(Math.toRadians(d11))))));
            i8++;
            i7 = i7;
            d10 = d10;
            d9 = 360.0d;
        }
        double d13 = d10;
        this.f4259z = new ArrayList();
        if (d.KITE.equals(this.B)) {
            a(arrayList, d13, d8);
        } else {
            b(arrayList, d13, d8);
        }
        h();
    }

    private void h() {
        c();
        this.A = new ArrayList();
        for (int i7 = 0; i7 < this.f4259z.size(); i7++) {
            c cVar = (c) this.f4259z.get(i7);
            if (i7 != 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt((int) ((255.0d / this.f4258y) * i7), 0);
                ofInt.setRepeatCount(1);
                ofInt.setDuration((int) (i7 * (this.f4256w / this.f4258y)));
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addUpdateListener(new a(cVar));
                ofInt.start();
                this.A.add(ofInt);
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
            ofInt2.setRepeatCount(-1);
            ofInt2.setDuration(this.f4256w);
            ofInt2.setInterpolator(new LinearInterpolator());
            ofInt2.setStartDelay((int) (i7 * (this.f4256w / this.f4258y)));
            ofInt2.addUpdateListener(new b(cVar));
            ofInt2.start();
            this.A.add(ofInt2);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.f4259z.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        this.f4251r = getWidth();
        int height = getHeight();
        this.f4252s = height;
        this.f4257x.set(this.f4251r / 2.0f, height / 2.0f);
        g();
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(View.resolveSize(this.f4253t, i7), View.resolveSize(this.f4254u, i8));
    }

    public void setColor(int i7) {
        this.f4250q = i7;
        List list = this.f4259z;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).c(i7);
            }
        }
        invalidate();
    }

    public void setDuration(int i7) {
        this.f4256w = i7;
        h();
    }

    public void setFigurePadding(int i7) {
        this.f4255v = i7;
        g();
    }

    public void setFigurePaddingInDp(int i7) {
        setFigurePadding(d(i7));
    }

    public void setNumberOfAngles(int i7) {
        this.f4258y = i7;
        g();
    }

    public void setType(d dVar) {
        this.B = dVar;
        g();
    }
}

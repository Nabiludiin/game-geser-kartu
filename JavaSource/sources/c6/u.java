package c6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import c6.t;

/* compiled from: MyApplication */
final class u extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    private static final Paint f3706h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3707a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3708b;

    /* renamed from: c, reason: collision with root package name */
    private final t.e f3709c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f3710d;

    /* renamed from: e, reason: collision with root package name */
    long f3711e;

    /* renamed from: f, reason: collision with root package name */
    boolean f3712f;

    /* renamed from: g, reason: collision with root package name */
    int f3713g;

    u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z7, boolean z8) {
        super(context.getResources(), bitmap);
        this.f3713g = 255;
        this.f3707a = z8;
        this.f3708b = context.getResources().getDisplayMetrics().density;
        this.f3709c = eVar;
        if (eVar == t.e.MEMORY || z7) {
            return;
        }
        this.f3710d = drawable;
        this.f3712f = true;
        this.f3711e = SystemClock.uptimeMillis();
    }

    private void a(Canvas canvas) {
        Paint paint = f3706h;
        paint.setColor(-1);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f3708b * 16.0f)), paint);
        paint.setColor(this.f3709c.f3700q);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f3708b * 15.0f)), paint);
    }

    private static Path b(Point point, int i7) {
        Point point2 = new Point(point.x + i7, point.y);
        Point point3 = new Point(point.x, point.y + i7);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    static void c(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z7, boolean z8) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z7, z8));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3712f) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.f3711e) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f3712f = false;
                this.f3710d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f3710d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f3713g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f3713g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f3707a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3710d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f3713g = i7;
        Drawable drawable = this.f3710d;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
        super.setAlpha(i7);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3710d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}

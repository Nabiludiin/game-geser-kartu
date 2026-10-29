package c6;

import java.io.PrintWriter;

/* compiled from: MyApplication */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3575b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3576c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3577d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3578e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3579f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3580g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3581h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3582i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3583j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3584k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3585l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3586m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3587n;

    public b0(int i7, int i8, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i9, int i10, int i11, long j15) {
        this.f3574a = i7;
        this.f3575b = i8;
        this.f3576c = j7;
        this.f3577d = j8;
        this.f3578e = j9;
        this.f3579f = j10;
        this.f3580g = j11;
        this.f3581h = j12;
        this.f3582i = j13;
        this.f3583j = j14;
        this.f3584k = i9;
        this.f3585l = i10;
        this.f3586m = i11;
        this.f3587n = j15;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f3574a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f3575b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f3575b / this.f3574a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f3576c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f3577d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f3584k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f3578e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f3581h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f3585l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f3579f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f3586m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f3580g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f3582i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f3583j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f3574a + ", size=" + this.f3575b + ", cacheHits=" + this.f3576c + ", cacheMisses=" + this.f3577d + ", downloadCount=" + this.f3584k + ", totalDownloadSize=" + this.f3578e + ", averageDownloadSize=" + this.f3581h + ", totalOriginalBitmapSize=" + this.f3579f + ", totalTransformedBitmapSize=" + this.f3580g + ", averageOriginalBitmapSize=" + this.f3582i + ", averageTransformedBitmapSize=" + this.f3583j + ", originalBitmapCount=" + this.f3585l + ", transformedBitmapCount=" + this.f3586m + ", timeStamp=" + this.f3587n + '}';
    }
}

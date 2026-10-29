package p3;

import android.net.Uri;

/* compiled from: MyApplication */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f25255a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f25256b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25257c = 0;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f25255a = parse;
        f25256b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}

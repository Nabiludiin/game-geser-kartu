package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: MyApplication */
public abstract class pu3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f14112a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i7, Intent intent, int i8) {
        return PendingIntent.getActivity(context, 0, c(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent b(Context context, int i7, Intent intent, int i8, int i9) {
        return PendingIntent.getService(context, 0, c(intent, 1140850688, 0), 1140850688);
    }

    private static Intent c(Intent intent, int i7, int i8) {
        rx3.b((i7 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        rx3.b((i7 & 1) == 0 || d(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        rx3.b((i7 & 2) == 0 || d(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        rx3.b((i7 & 4) == 0 || d(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        rx3.b((i7 & 128) == 0 || d(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        rx3.b(intent.getComponent() != null, "Must set component on Intent.");
        if (d(0, 1)) {
            rx3.b(!d(i7, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            rx3.b(d(i7, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!d(i7, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f14112a);
            }
        }
        return intent2;
    }

    private static boolean d(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}

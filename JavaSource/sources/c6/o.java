package c6;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import c6.t;
import c6.y;

/* compiled from: MyApplication */
class o extends g {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f3647b = {"orientation"};

    /* compiled from: MyApplication */
    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: q, reason: collision with root package name */
        final int f3652q;

        /* renamed from: r, reason: collision with root package name */
        final int f3653r;

        /* renamed from: s, reason: collision with root package name */
        final int f3654s;

        a(int i7, int i8, int i9) {
            this.f3652q = i7;
            this.f3653r = i8;
            this.f3654s = i9;
        }
    }

    o(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = c6.o.f3647b     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L21
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            if (r8 != 0) goto L16
            goto L21
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            r1.close()
            return r8
        L1e:
            r0 = move-exception
            r8 = r0
            goto L27
        L21:
            if (r1 == 0) goto L26
            r1.close()
        L26:
            return r0
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r8
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.o.k(android.content.ContentResolver, android.net.Uri):int");
    }

    static a l(int i7, int i8) {
        a aVar = a.MICRO;
        if (i7 <= aVar.f3653r && i8 <= aVar.f3654s) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i7 > aVar2.f3653r || i8 > aVar2.f3654s) ? a.FULL : aVar2;
    }

    @Override // c6.g, c6.y
    public boolean c(w wVar) {
        Uri uri = wVar.f3719d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // c6.g, c6.y
    public y.a f(w wVar, int i7) {
        w wVar2;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f3606a.getContentResolver();
        int k7 = k(contentResolver, wVar.f3719d);
        String type = contentResolver.getType(wVar.f3719d);
        boolean z7 = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a l7 = l(wVar.f3723h, wVar.f3724i);
            if (!z7 && l7 == a.FULL) {
                return new y.a(null, j(wVar), t.e.DISK, k7);
            }
            long parseId = ContentUris.parseId(wVar.f3719d);
            BitmapFactory.Options d8 = y.d(wVar);
            d8.inJustDecodeBounds = true;
            wVar2 = wVar;
            y.a(wVar.f3723h, wVar.f3724i, l7.f3653r, l7.f3654s, d8, wVar2);
            if (z7) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l7 != a.FULL ? l7.f3652q : 1, d8);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l7.f3652q, d8);
            }
            if (thumbnail != null) {
                return new y.a(thumbnail, null, t.e.DISK, k7);
            }
        } else {
            wVar2 = wVar;
        }
        return new y.a(null, j(wVar2), t.e.DISK, k7);
    }
}

package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* compiled from: MyApplication */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f1699k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f1700a;

    /* renamed from: b, reason: collision with root package name */
    Object f1701b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1702c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1703d;

    /* renamed from: e, reason: collision with root package name */
    public int f1704e;

    /* renamed from: f, reason: collision with root package name */
    public int f1705f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1706g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f1707h;

    /* renamed from: i, reason: collision with root package name */
    public String f1708i;

    /* renamed from: j, reason: collision with root package name */
    public String f1709j;

    /* compiled from: MyApplication */
    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                return -1;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f1700a) {
                case -1:
                    return (Icon) iconCompat.f1701b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1701b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.f(), iconCompat.f1704e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f1701b, iconCompat.f1704e, iconCompat.f1705f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f1701b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f1701b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f1701b);
                        break;
                    }
                case 6:
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        createWithBitmap = d.a(iconCompat.h());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        InputStream i8 = iconCompat.i(context);
                        if (i8 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        if (i7 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(i8), false));
                            break;
                        } else {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(i8));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f1706g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1707h;
            if (mode != IconCompat.f1699k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* compiled from: MyApplication */
    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* compiled from: MyApplication */
    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1700a = -1;
        this.f1702c = null;
        this.f1703d = null;
        this.f1704e = 0;
        this.f1705f = 0;
        this.f1706g = null;
        this.f1707h = f1699k;
        this.f1708i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z7) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f8 = min;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (z7) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1701b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i7) {
        androidx.core.util.c.c(str);
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1704e = i7;
        if (resources != null) {
            try {
                iconCompat.f1701b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1701b = str;
        }
        iconCompat.f1709j = str;
        return iconCompat;
    }

    private static String n(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i7 = this.f1700a;
        if (i7 == -1) {
            Object obj = this.f1701b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f1701b;
        }
        if (i7 == 5) {
            return a((Bitmap) this.f1701b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i7 = this.f1700a;
        if (i7 == -1) {
            return a.a(this.f1701b);
        }
        if (i7 == 2) {
            return this.f1704e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i7 = this.f1700a;
        if (i7 == -1) {
            return a.b(this.f1701b);
        }
        if (i7 == 2) {
            String str = this.f1709j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1701b).split(":", -1)[0] : this.f1709j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i7 = this.f1700a;
        return i7 == -1 ? a.c(this.f1701b) : i7;
    }

    public Uri h() {
        int i7 = this.f1700a;
        if (i7 == -1) {
            return a.d(this.f1701b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f1701b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        Uri h8 = h();
        String scheme = h8.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h8);
            } catch (Exception e8) {
                Log.w("IconCompat", "Unable to load image from URI: " + h8, e8);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f1701b));
        } catch (FileNotFoundException e9) {
            Log.w("IconCompat", "Unable to load image from path: " + h8, e9);
            return null;
        }
    }

    public void j() {
        this.f1707h = PorterDuff.Mode.valueOf(this.f1708i);
        switch (this.f1700a) {
            case -1:
                Parcelable parcelable = this.f1703d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f1701b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1703d;
                if (parcelable2 != null) {
                    this.f1701b = parcelable2;
                    return;
                }
                byte[] bArr = this.f1702c;
                this.f1701b = bArr;
                this.f1700a = 3;
                this.f1704e = 0;
                this.f1705f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1702c, Charset.forName("UTF-16"));
                this.f1701b = str;
                if (this.f1700a == 2 && this.f1709j == null) {
                    this.f1709j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1701b = this.f1702c;
                return;
        }
    }

    public void k(boolean z7) {
        this.f1708i = this.f1707h.name();
        switch (this.f1700a) {
            case -1:
                if (z7) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f1703d = (Parcelable) this.f1701b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z7) {
                    this.f1703d = (Parcelable) this.f1701b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f1701b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f1702c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f1702c = ((String) this.f1701b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1702c = (byte[]) this.f1701b;
                return;
            case 4:
            case 6:
                this.f1702c = this.f1701b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon l() {
        return m(null);
    }

    public Icon m(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f1700a == -1) {
            return String.valueOf(this.f1701b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(n(this.f1700a));
        switch (this.f1700a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1701b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1701b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1709j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1704e);
                if (this.f1705f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1705f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1701b);
                break;
        }
        if (this.f1706g != null) {
            sb.append(" tint=");
            sb.append(this.f1706g);
        }
        if (this.f1707h != f1699k) {
            sb.append(" mode=");
            sb.append(this.f1707h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i7) {
        this.f1702c = null;
        this.f1703d = null;
        this.f1704e = 0;
        this.f1705f = 0;
        this.f1706g = null;
        this.f1707h = f1699k;
        this.f1708i = null;
        this.f1700a = i7;
    }
}

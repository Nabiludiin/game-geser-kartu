package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: MyApplication */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1179a;

    /* renamed from: b, reason: collision with root package name */
    String f1180b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC0017b f1181c;

    /* renamed from: d, reason: collision with root package name */
    private int f1182d;

    /* renamed from: e, reason: collision with root package name */
    private float f1183e;

    /* renamed from: f, reason: collision with root package name */
    private String f1184f;

    /* renamed from: g, reason: collision with root package name */
    boolean f1185g;

    /* renamed from: h, reason: collision with root package name */
    private int f1186h;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1187a;

        static {
            int[] iArr = new int[EnumC0017b.values().length];
            f1187a = iArr;
            try {
                iArr[EnumC0017b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1187a[EnumC0017b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1187a[EnumC0017b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1187a[EnumC0017b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1187a[EnumC0017b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1187a[EnumC0017b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1187a[EnumC0017b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1187a[EnumC0017b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public enum EnumC0017b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, EnumC0017b enumC0017b, Object obj, boolean z7) {
        this.f1180b = str;
        this.f1181c = enumC0017b;
        this.f1179a = z7;
        d(obj);
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
            } catch (NoSuchMethodException e9) {
                e9.printStackTrace();
            } catch (InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        EnumC0017b enumC0017b;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f1421k4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0017b enumC0017b2 = null;
        boolean z7 = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == h.f1429l4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == h.f1509v4) {
                str = obtainStyledAttributes.getString(index);
                z7 = true;
            } else if (index == h.f1437m4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0017b2 = EnumC0017b.BOOLEAN_TYPE;
            } else {
                if (index == h.f1453o4) {
                    enumC0017b = EnumC0017b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.f1445n4) {
                    enumC0017b = EnumC0017b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.f1485s4) {
                    enumC0017b = EnumC0017b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == h.f1461p4) {
                    enumC0017b = EnumC0017b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.f1469q4) {
                    enumC0017b = EnumC0017b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == h.f1477r4) {
                    enumC0017b = EnumC0017b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == h.f1501u4) {
                    enumC0017b = EnumC0017b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == h.f1493t4) {
                    enumC0017b = EnumC0017b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                enumC0017b2 = enumC0017b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, enumC0017b2, obj, z7));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            String str2 = bVar.f1179a ? str : "set" + str;
            try {
                int i7 = a.f1187a[bVar.f1181c.ordinal()];
                Class<?> cls2 = Float.TYPE;
                Class<?> cls3 = Integer.TYPE;
                switch (i7) {
                    case 1:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f1182d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f1185g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f1184f);
                        break;
                    case 4:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f1186h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f1186h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f1182d));
                        break;
                    case 7:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(bVar.f1183e));
                        break;
                    case 8:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(bVar.f1183e));
                        break;
                }
            } catch (IllegalAccessException e8) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e8.printStackTrace();
            } catch (NoSuchMethodException e9) {
                Log.e("TransitionLayout", e9.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.f1187a[this.f1181c.ordinal()]) {
            case 1:
            case 6:
                this.f1182d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f1185g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f1184f = (String) obj;
                break;
            case 4:
            case 5:
                this.f1186h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f1183e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f1183e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.f1179a = false;
        this.f1180b = bVar.f1180b;
        this.f1181c = bVar.f1181c;
        d(obj);
    }
}

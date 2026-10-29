package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f1206a;

    /* renamed from: b, reason: collision with root package name */
    int f1207b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f1208c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray f1209d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f1210e = new SparseArray();

    /* compiled from: MyApplication */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1211a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f1212b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f1213c;

        /* renamed from: d, reason: collision with root package name */
        e f1214d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1213c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.E6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == h.F6) {
                    this.f1211a = obtainStyledAttributes.getResourceId(index, this.f1211a);
                } else if (index == h.G6) {
                    this.f1213c = obtainStyledAttributes.getResourceId(index, this.f1213c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1213c);
                    context.getResources().getResourceName(this.f1213c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1214d = eVar;
                        eVar.d(context, this.f1213c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1212b.add(bVar);
        }
    }

    /* compiled from: MyApplication */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f1215a;

        /* renamed from: b, reason: collision with root package name */
        float f1216b;

        /* renamed from: c, reason: collision with root package name */
        float f1217c;

        /* renamed from: d, reason: collision with root package name */
        float f1218d;

        /* renamed from: e, reason: collision with root package name */
        int f1219e;

        /* renamed from: f, reason: collision with root package name */
        e f1220f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1215a = Float.NaN;
            this.f1216b = Float.NaN;
            this.f1217c = Float.NaN;
            this.f1218d = Float.NaN;
            this.f1219e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f1354c7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == h.f1363d7) {
                    this.f1219e = obtainStyledAttributes.getResourceId(index, this.f1219e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1219e);
                    context.getResources().getResourceName(this.f1219e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1220f = eVar;
                        eVar.d(context, this.f1219e);
                    }
                } else if (index == h.f1372e7) {
                    this.f1218d = obtainStyledAttributes.getDimension(index, this.f1218d);
                } else if (index == h.f1381f7) {
                    this.f1216b = obtainStyledAttributes.getDimension(index, this.f1216b);
                } else if (index == h.f1390g7) {
                    this.f1217c = obtainStyledAttributes.getDimension(index, this.f1217c);
                } else if (index == h.f1399h7) {
                    this.f1215a = obtainStyledAttributes.getDimension(index, this.f1215a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i7) {
        this.f1206a = constraintLayout;
        a(context, i7);
    }

    private void a(Context context, int i7) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xml);
                                this.f1209d.put(aVar.f1211a, aVar);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.i(context, xmlPullParser);
                this.f1210e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}

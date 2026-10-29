package v2;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class k1 {

    /* renamed from: b, reason: collision with root package name */
    private static List f26784b;

    /* renamed from: a, reason: collision with root package name */
    private static final Map f26783a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f26785c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = f26785c;
        synchronized (obj) {
            Map map = f26783a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f26784b == null) {
                            f26784b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f26784b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                hashMap.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    hashMap.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                    hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    hashMap.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                    hashMap.put("widths", b(videoCapabilities.getSupportedWidths()));
                                    hashMap.put("heights", b(videoCapabilities.getSupportedHeights()));
                                }
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(hashMap);
                            }
                        }
                        f26783a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e8) {
                e = e8;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f26783a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e9) {
                e = e9;
                HashMap hashMap22 = new HashMap();
                hashMap22.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(hashMap22);
                f26783a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    private static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}

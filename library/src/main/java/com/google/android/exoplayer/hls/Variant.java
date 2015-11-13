/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatWrapper;
import com.google.android.exoplayer.util.MimeTypes;

/**
 * Variant stream reference.
 */
public final class Variant implements FormatWrapper {

  public final String url;
  public final Format format;
  public final String name;

  public Variant(int index, String name, String url, int bitrate, String codecs, int width,
      int height) {
    this.url = url;
    this.name = name;
    String formatName = name != null ? name : Integer.toString(index);
    format = new Format(formatName, url, MimeTypes.APPLICATION_M3U8, width, height, -1, -1,
        -1, bitrate, null, codecs);
  }

  @Override
  public Format getFormat() {
    return format;
  }

}

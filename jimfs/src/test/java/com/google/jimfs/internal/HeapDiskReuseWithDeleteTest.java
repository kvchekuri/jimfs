/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.jimfs.internal;

import org.junit.After;

/**
 * Tests for {@link HeapDisk} that reuse a disk for each store created. Stores are deleted after
 * each test, meaning blocks will be reused.
 *
 * @author Colin Decker
 */
public class HeapDiskReuseWithDeleteTest extends HeapDiskReuseTest {

  @After
  public void tearDown() {
    store.deleteContents();
  }
}

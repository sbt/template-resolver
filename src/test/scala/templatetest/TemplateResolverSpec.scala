/*
 * Copyright 2016 Lightbend, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package templatetest

import org.scalatest.flatspec.AnyFlatSpec
import sbt.template.TemplateResolver

class TemplateResolverSpec extends AnyFlatSpec {
  "resolver" should "check if it supports the given argument" in {
    assert(resolver.isDefined(Array("--xx", "foo/bar")) == true)
  }

  def resolver: TemplateResolver = new TemplateResolver {
    def isDefined(args: Array[String]): Boolean = args.toList contains "foo/bar"
    def run(args: Array[String]): Unit = ()
  }
}

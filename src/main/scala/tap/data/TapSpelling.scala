/*
 * Copyright 2016-2017 original author or authors
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

package tap.data

/**
  * Created by andrew@andrewresearch.net on 17/10/17.
  */

case class TapSpelling(sentIdx:Int,spelling:Vector[TapSpell]) extends TapAnalytics

case class TapSpell(message:String,suggestions:Vector[String],start:Int, end:Int)
/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security.delete_privileges;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: security.delete_privileges.FoundStatus
@JsonpDeserializable
public final class FoundStatus implements JsonpSerializable {
	private final boolean found;

	// ---------------------------------------------------------------------------------------------

	public FoundStatus(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");

	}

	public FoundStatus(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("found");
		generator.write(this.found);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FoundStatus}.
	 */
	public static class Builder implements ObjectBuilder<FoundStatus> {
		private Boolean found;

		/**
		 * Required - API name: {@code found}
		 */
		public Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Builds a {@link FoundStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FoundStatus build() {

			return new FoundStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FoundStatus}
	 */
	public static final JsonpDeserializer<FoundStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FoundStatus::setupFoundStatusDeserializer, Builder::build);

	protected static void setupFoundStatusDeserializer(DelegatingDeserializer<FoundStatus.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");

	}

}
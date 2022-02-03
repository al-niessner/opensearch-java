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

package org.opensearch.clients.opensearch._types;

import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.IndicesResponseBase

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Base.ts#L81-L83">API
 *      specification</a>
 */

public abstract class IndicesResponseBase extends AcknowledgedResponseBase {
	@Nullable
	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	protected IndicesResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.shards = builder.shards;

	}

	/**
	 * API name: {@code _shards}
	 */
	@Nullable
	public final ShardStatistics shards() {
		return this.shards;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.shards != null) {
			generator.writeKey("_shards");
			this.shards.serialize(generator, mapper);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AcknowledgedResponseBase.AbstractBuilder<BuilderT> {
		@Nullable
		private ShardStatistics shards;

		/**
		 * API name: {@code _shards}
		 */
		public final BuilderT shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public final BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupIndicesResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		setupAcknowledgedResponseBaseDeserializer(op);
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");

	}

}
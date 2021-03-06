package se.culvertsoft.mgen.visualdesigner.model

object ModelConversion {

  type ApiEntity = Object
  type ApiProject = se.culvertsoft.mgen.api.model.Project
  type ApiModule = se.culvertsoft.mgen.api.model.Module
  type ApiClass = se.culvertsoft.mgen.api.model.ClassType
  type ApiField = se.culvertsoft.mgen.api.model.Field
  type ApiGenerator = se.culvertsoft.mgen.api.model.GeneratorDescriptor
  type ApiUserDefinedType = se.culvertsoft.mgen.api.model.UserDefinedType
  type ApiType = se.culvertsoft.mgen.api.model.Type
  type ApiEnum = se.culvertsoft.mgen.api.model.EnumType
  type ApiEnumEntry = se.culvertsoft.mgen.api.model.EnumEntry

  type VdModel = se.culvertsoft.mgen.visualdesigner.model.Model
  type VdEntity = se.culvertsoft.mgen.visualdesigner.model.Entity
  type VdProject = se.culvertsoft.mgen.visualdesigner.model.Project
  type VdModule = se.culvertsoft.mgen.visualdesigner.model.Module
  type VdClass = se.culvertsoft.mgen.visualdesigner.model.CustomType
  type VdField = se.culvertsoft.mgen.visualdesigner.model.CustomTypeField
  type VdFieldType = se.culvertsoft.mgen.visualdesigner.model.FieldType
  type VdGenerator = se.culvertsoft.mgen.visualdesigner.model.Generator
  type VdEnum = se.culvertsoft.mgen.visualdesigner.model.EnumType
  type VdEnumEntry = se.culvertsoft.mgen.visualdesigner.model.EnumEntry
  type VdUserDefinedType = se.culvertsoft.mgen.visualdesigner.model.UserDefinedType

  type VdEnumType = se.culvertsoft.mgen.visualdesigner.model.EnumType
  type VdBoolType = se.culvertsoft.mgen.visualdesigner.model.BoolType
  type VdInt8Type = se.culvertsoft.mgen.visualdesigner.model.Int8Type
  type VdInt16Type = se.culvertsoft.mgen.visualdesigner.model.Int16Type
  type VdInt32Type = se.culvertsoft.mgen.visualdesigner.model.Int32Type
  type VdInt64Type = se.culvertsoft.mgen.visualdesigner.model.Int64Type
  type VdFloat32Type = se.culvertsoft.mgen.visualdesigner.model.Float32Type
  type VdFloat64Type = se.culvertsoft.mgen.visualdesigner.model.Float64Type
  type VdStringType = se.culvertsoft.mgen.visualdesigner.model.StringType
  type VdListType = se.culvertsoft.mgen.visualdesigner.model.ListType
  type VdArrayType = se.culvertsoft.mgen.visualdesigner.model.ArrayType
  type VdMapType = se.culvertsoft.mgen.visualdesigner.model.MapType
  type VdUserTypeRef = se.culvertsoft.mgen.visualdesigner.model.UserTypeRef

  type ApiEnumType = se.culvertsoft.mgen.api.model.EnumType
  type ApiBoolType = se.culvertsoft.mgen.api.model.BoolType
  type ApiInt8Type = se.culvertsoft.mgen.api.model.Int8Type
  type ApiInt16Type = se.culvertsoft.mgen.api.model.Int16Type
  type ApiInt32Type = se.culvertsoft.mgen.api.model.Int32Type
  type ApiInt64Type = se.culvertsoft.mgen.api.model.Int64Type
  type ApiFloat32Type = se.culvertsoft.mgen.api.model.Float32Type
  type ApiFloat64Type = se.culvertsoft.mgen.api.model.Float64Type
  type ApiStringType = se.culvertsoft.mgen.api.model.StringType
  type ApiListType = se.culvertsoft.mgen.api.model.ListType
  type ApiArrayType = se.culvertsoft.mgen.api.model.ArrayType
  type ApiMapType = se.culvertsoft.mgen.api.model.MapType
  type ApiCustomType = se.culvertsoft.mgen.api.model.ClassType

  val ApiBoolTypeInstance = se.culvertsoft.mgen.api.model.BoolType.INSTANCE
  val ApiInt8TypeInstance = se.culvertsoft.mgen.api.model.Int8Type.INSTANCE
  val ApiInt16TypeInstance = se.culvertsoft.mgen.api.model.Int16Type.INSTANCE
  val ApiInt32TypeInstance = se.culvertsoft.mgen.api.model.Int32Type.INSTANCE
  val ApiInt64TypeInstance = se.culvertsoft.mgen.api.model.Int64Type.INSTANCE
  val ApiFloat32TypeInstance = se.culvertsoft.mgen.api.model.Float32Type.INSTANCE
  val ApiFloat64TypeInstance = se.culvertsoft.mgen.api.model.Float64Type.INSTANCE
  val ApiStringTypeInstance = se.culvertsoft.mgen.api.model.StringType.INSTANCE

  def vd2Api(model: VdModel): ApiProject = {
    Vd2Api(model)
  }

  def api2Vd(project: ApiProject): VdModel = {
    Api2Vd(project)
  }

}
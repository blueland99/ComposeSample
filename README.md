# AndroidComposeSample

## Gitmoji 커밋 메시지 규칙

이 프로젝트에서는 Gitmoji를 사용하여 커밋 메시지를 시각적으로 쉽게 이해할 수 있도록 합니다. 다음은 자주 사용하는 Gitmoji와 의미입니다:

- ✨ **feat**: 새로운 기능 추가
- 🐛 **fix**: 버그 수정
- 📝 **docs**: 문서 관련 변경 사항
- 🎨 **style**: 코드 형식(포맷팅, 공백 등) 수정, 기능에 영향 없음
- 🔨 **refactor**: 코드 리팩토링, 기능의 변화 없음
- 🛠️ **chore**: 빌드 시스템 또는 외부 도구와 관련된 변경 사항
- 🚀 **perf**: 성능 개선
- ✅ **test**: 테스트 추가 또는 수정
- 🔥 **remove**: 불필요한 코드나 파일 삭제

커밋 메시지를 작성할 때는 위의 이모지와 함께 커밋의 목적을 간결하게 설명합니다.

## 개요
이 프로젝트는 **Android Compose**와 **MVVM** 패턴을 기반으로 Hilt를 사용하여 의존성 주입을 처리하며, Retrofit을 통해 서버와 통신하는 앱입니다. UI는 Jetpack Compose로 구성되며, 테마와 스타일을 통합하여 사용자 경험을 제공합니다.

## 기술 스택
- **언어**: Kotlin
- **아키텍처 패턴**: MVVM
- **UI 프레임워크**: Jetpack Compose
- **의존성 주입**: Hilt
- **네트워크 통신**: Retrofit

## 프로젝트 구조

```
com.example.app
├── ui
│   ├── theme
│   │   ├── Color.kt
│   │   ├── Typography.kt
│   │   ├── Shape.kt
│   │   └── Theme.kt
│   ├── MainScreen.kt
│   └── DetailScreen.kt
├── viewmodel
│   ├── MainViewModel.kt
│   └── DetailViewModel.kt
├── data
│   └── remote
│       ├── APIService.kt
│       └── RetrofitClient.kt
├── di
│   └── AppModule.kt
├── MainActivity.kt
└── MyApp.kt
```

1. ui
    - theme: 앱의 전역 스타일을 정의합니다.
        - Color.kt: 앱에서 사용할 색상을 정의합니다.
        - Typography.kt: 텍스트 스타일을 정의합니다.
        - Shape.kt: 앱의 기본 모양(Shape)을 정의합니다.
        - Theme.kt: 앱의 전반적인 테마를 설정합니다.
    - MainScreen.kt: 메인 화면을 구성하는 Composable 함수가 포함됩니다.
    - DetailScreen.kt: 상세 화면을 구성하는 Composable 함수가 포함됩니다.

2. viewmodel
    - MainViewModel.kt: 메인 화면의 데이터를 처리하고 API 통신을 관리합니다.
    - DetailViewModel.kt: 상세 화면의 데이터를 처리하고 API 통신을 관리합니다.

3. data
    - remote: 서버와 통신하는 API 관련 클래스를 포함합니다.
        - APIService.kt: Retrofit을 사용하여 API 호출을 정의합니다.
        - RetrofitClient.kt: Retrofit 클라이언트를 초기화하고 관리합니다.

4. di
    - AppModule.kt: Hilt를 사용한 의존성 주입 설정을 담당합니다. APIService와 RetrofitClient를 주입합니다.

5. MainActivity.kt
    - MainActivity는 앱의 진입점으로, Compose UI가 이곳에서 설정됩니다. Hilt를 사용하여 ViewModel과 API 통신을 처리합니다.

6. MyApp.kt
    - MyApp은 Application 클래스로, Hilt의 의존성 주입을 활성화하기 위해 사용됩니다. 앱의 전역 상태와 의존성 관리를 담당합니다.